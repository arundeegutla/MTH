//https://studio.code.org/projects/applab/_crT2FwcyzmfQsBZbwUbq6GzeVgbwa8NoxMEJNkx1WM
//Variables
var bulletSpeed = 0;
var moveRight;
var moveLeft;
var antibodyX = 130;
var antibodyY = 320;
var antibodywidth = 50;
var antibodySpeed = 0;
var Firebullet;
var bulletY = 400;
var bulletX = (antibodyX + 15);
var round = 0;
var score = 0;
var clearBonus = 20;
var bulletwidth = 20;
var bulletheight = 20;
var enemyHeight = 55;
var enemyWidth = 75;
var totalEnemies = 0;
var enemyURLs = ["corona1-removebg-preview.png", "corona2-removebg-preview.png", "corona3.png"];
var startingTime = 15; //the timer is set to at the start of a game
var currentTime;
var timeIncrease = 5;

//Start the game
onEvent("Start", "click", function() {
    setScreen("cutscene");
});
//How to play
onEvent("informationicon", "click", function(){
      setScreen("information");
});
onEvent("button2", "click", function(){
      setScreen("startscreen");
});
//constantly runs to check for new variables every 15 ms
function update() {
    checkbullet();
    moveantibody();
    target();
    bulletY += bulletSpeed;
    antibodyX += antibodySpeed;
    setPosition("bullet", bulletX, bulletY); 
    setPosition("antibody", antibodyX, antibodyY);
    setText("scorelabel",score + "🏆");
}
onEvent("playAgainButton", "click", function(){
  startGame();
});
function startGame(){
  currentTime = startingTime;
  setScreen("GameScreen");
  showElement("image1");
  setImageURL("image1", "321.gif");
  setTimeout(function() {
    hideElement("image1");
    setText("timeleft", "⌛" + currentTime);
    round++;
    spawnEnemies(2 * round);
    hideElement("bullet");
    timedLoop(1000, function() { // every second, the timer goes down by 1
    setText("timeleft", "⌛" + (currentTime -= 1)); 
      if(currentTime <= 0){ // Once the timer reaches 0, game over
        round = 0;
        deleteAllEnemies();
        totalEnemies = 0;
        setScreen("Gameover");
        setText("gameoverscore", score);
        score = 0;
        stopTimedLoop();
      }
  });
    timedLoop(17, update);
  }, 800);
}
//controlling the antidote
      //mouse events
        onEvent("rightclick", "mousedown", function( ) {
          moveRight = true;
        });
        onEvent("leftclick", "mousedown", function( ) {
          moveLeft = true;
        });
        onEvent("rightclick", "mouseup", function( ) {
          moveRight = false;
        });
        onEvent("leftclick", "mouseup", function( ) {
          moveLeft = false;
        });
        onEvent("shootbutton", "mousedown", function( ) {
          bulletX = antibodyX + 17.5;
          showElement("bullet");
          playSound("sound://category_hits/vibrant_game_arcade_game_negative_hit_2.mp3", false);
          bulletSpeed = -10 ;
        });
      
    //keyboard events
        //Left and Right
      onEvent("GameScreen", "keydown", function(event) {
        if ((event.key == "Left")||(event.key == "a")) {
            moveLeft = true;
        } else if ((event.key == "Right")||(event.key == "d")) {
            moveRight = true;
        }
      });
      onEvent("GameScreen", "keyup", function(event) {
        if ((event.key == "Left")||(event.key == "a"))  {
            moveLeft = false;
        } else if ((event.key == "Right")||(event.key == "d")) {
            moveRight = false;
        }
      });
        //Shoot the bullet
      onEvent("GameScreen", "keypress", function(event) {
        if (event.keyCode == 32) {
            Firebullet = true;
            bulletX = antibodyX + 17.5;
            showElement("bullet");
            bulletSpeed = -15 ;
          }
      });
      //moves antibody left and right
      function moveantibody() {
        if ((moveLeft && !moveRight) && antibodyX > 0) {
            antibodySpeed = -3;//speed
        } else if (moveRight && !moveLeft && antibodyX + antibodywidth < 320) {
            antibodySpeed = 3;
        } else {
            antibodySpeed = 0;
        }
      }

function spawnEnemies(numOfEnemies){ // spawns 
  for(var i = 0; i < numOfEnemies; i++){
    var enemyId = "enemy" + i;
    var url = enemyURLs[randomNumber(0, enemyURLs.length-1)];
    var x = randomNumber(0, 240);
    var y = randomNumber(60, 200);
    
    image(enemyId, url);
    setPosition(enemyId, x, y, enemyWidth, enemyHeight);
  }
  totalEnemies = numOfEnemies;
}
 
function deleteAllEnemies(){
  for(var i = 0; i < totalEnemies; i++){
    var id = "enemy" + i;
    deleteElement(id);
  }
}
function checkbullet() { //checks if bullet goes off screen and to reload it
  if (bulletY <= 0 ) {
  bulletSpeed = 0;
  bulletY = 400;
  hideElement("bullet");
  } 
}
function allEnemiesAreGone(){
  for(var i = 0; i < totalEnemies; i++){
    var id = "enemy" + i;
    var isHidden = getProperty(id, "hidden");
    
    if(!isHidden){
      return false;
    }
  }
  return true;
}
//spawns enemys and adds score when enemys are hit
function target() {
  
  for(var i = 0; i < totalEnemies; i++){
    var id = "enemy" + i;
    var enemyX = getXPosition(id);
    var enemyY = getYPosition(id);
    var enemyWidth = getProperty(id, "width");
    var enemyHeight = getProperty(id, "height");
    
    if (checkCollision(bulletX, bulletY, bulletheight, bulletwidth, enemyX, enemyY, enemyWidth, enemyHeight)){
      score += 10;
      bulletSpeed = 0;
      bulletY = 400;
      hideElement("bullet");
      explode(getProperty(id, "x"), getProperty(id, "y"));
      setPosition(id, -100, -100);
      setProperty(id, "hidden", true);
    
      
      if(allEnemiesAreGone()){
        currentTime += timeIncrease;
        score += clearBonus;
        deleteAllEnemies();
        totalEnemies = 0;
        round++;
        spawnEnemies(2 * round);
        playSound("sound://category_hits/vibrant_game_big_game_horn_hit.mp3", false);
      }
    }
  }
}
function explode(x, y) {
    image("explode", "explode.gif");
    playSound("sound://category_hits/vibrant_game_arcade_game_negative_hit_2.mp3", false);
    setPosition("explode", x, y, 55, 75);
    setTimeout(function() {
      deleteElement("explode");
  }, 200);
}


//checks for collison 
function checkCollision(x1, y1, h1, w1, x2, y2, h2, w2) {
    return x1 < x2 + w2 && x1 + w1 > x2 && y1 < y2 + h2 && y1 + h1 > y2;
}
//Cutscene
onEvent("cutscene", "click", function( ) {
  setScreen("cutscene2");
});
onEvent("cutscene2", "click", function( ) {
	setScreen("cutscene3");
});
onEvent("playbutton", "click", function( ) {
	startGame();
});
