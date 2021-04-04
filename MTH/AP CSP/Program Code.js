Game();

  function Game() {
    var score;
    var lives;
    var multiplier;
    var butterflyCost;
    var object = "frog";
    var time = 1000;
    var bought = false;
    onEvent("setting", "click", function(){
      setScreen("settings");
        onEvent("button1", "click", function() {
          setScreen("welcome_screen");
        });
    });
    onEvent("soundLogo", "click", function() {
      stopSound("Kahoottrap.mp3");
      hideElement("soundLogo");
      showElement("soundOffImg");
    });
    onEvent("soundOffImg", "click", function() {
      playSound("Kahoottrap.mp3", true);
      showElement("soundLogo");
      hideElement("soundOffImg");
    });
    onEvent("soundsetting", "click", function() {
        if (getChecked("soundsetting")) {
             playSound("Kahoottrap.mp3", true);
            } else {
              stopSound("Kahoottrap.mp3");
            }
    });
    onEvent("informationicon", "click", function(){
      setScreen("information");
    });
    onEvent("button2", "click", function() {
      playSound("Button-SoundBible.com-1420500901.mp3", false);
      setScreen("welcome_screen");
    });
    onEvent("pauseClick", "click", function() {
      showElement("vignette");
      showElement("resumeButton");
      showElement("quitButton");
      showElement("paused");
      showElement("storeButton");
      showElement("soundLogo");
      hideElement("pauseClick");
      stopTimedLoop();
    });
    onEvent("paused", "click", function() {
      resume();
    });
    onEvent("resumeButton", "click", function() {
      resume();
    });
    onEvent("playButton", "click", function() {
      originals();
      update();
      playSound("Button-SoundBible.com-1420500901.mp3", false);
      setScreen("game_screen");
      play();
      resume();
    });
    function resume() {
        hideElement("vignette");
        hideElement("resumeButton");
        hideElement("quitButton");
        hideElement("paused");
        hideElement("storeButton");
        hideElement("soundLogo");
        hideElement("soundOffImg");
        showElement("pauseClick");
    }
    function congrats() {
      hideElement("butterflyimg");
      hideElement("text");
      hideElement("text1");
      hideElement("butterfly_label");
      hideElement("ButterFly_Label");
      hideElement("get_butterfly");
      hideElement("frog");
      showElement("confetti");
      showElement("treasure");
      showElement("reward");
      showElement("nextPlay");
      showElement("vignette2");
    }
    function closeCongrats() {
      hideElement("confetti");
      hideElement("treasure");
      hideElement("reward");
      hideElement("nextPlay");
      hideElement("vignette2");
      showElement("butterfly");
      showElement("butterflyimg");
      showElement("text");
      showElement("text1");
      showElement("butterfly_label");
      showElement("ButterFly_Label");
      showElement("get_butterfly");
    }
    
    
    //Main Algorithm
    function play() {
      update();
      timer(time);
      //Increase the score by clicking the animal
      onEvent(object, "click", function() {
        move();
        score = score + multiplier;
        update();
        stopTimedLoop();
        //The animal moves faster with every click
        time = time - 10;
        timer(time);
      });
      //Lose life by clicking the background
      onEvent("backGround", "click", function() {
        lives = lives - 1;
        update();
      });
    }
    //Moves the animal
    function move(){
      if (object == "frog") {
        setPosition(object, randomNumber(0,220), randomNumber(245, 310));
      } else if (object == "butterfly"){
        setPosition(object, randomNumber(0,220), randomNumber(75, 310));
      }
    }
    function timer(num) {
      timedLoop(num, move);
    }
    
    
    onEvent("tryAgain_button", "click", function() {
      restart();
    });
    onEvent("quitButton", "click", function() {
      restart();
    });
    onEvent("storeButton", "click", function() {
      setScreen("store_screen");
      colorChange();
    });
    onEvent("exitStore_button", "click", function() {
      setScreen("game_screen");
    });
    onEvent("get_butterfly","click", function() {
      buy();
    });
    function restart(){
      setScreen("welcome_screen");
      originals();
      update();
      resume();
    }
    function originals(){
      score = 0;
      lives = 3;
      multiplier = 1;
      butterflyCost = 10;
    }
    function update(){
      setProperty("score_lbl", "text",("💰"+score));
      setText("multipliere","x" + multiplier);
      setProperty("number_Points", "text",("💰"+score));
      
      if (lives == 3) {
        showElement("life1");
        showElement("life2");
        showElement("life3");
      } else if (lives == 2){
        hideElement("life1");
        showElement("life2");
        showElement("life3");
      } else if (lives == 1){
        hideElement("life1");
        hideElement("life2");
        showElement("life3");
      } else if (lives == 0){
        hideElement("life1");
        hideElement("life2");
        hideElement("life3");
        setScreen("lose_screen");
      } 
    }
    
    
    function buy() {
      if((bought != true) && (butterflyCost <= score)){
        score = score - butterflyCost;
        multiplier = multiplier + 10;
        congrats();
        object = "butterfly";
        onEvent("nextPlay", "click", function() {
          closeCongrats();
          play();
          setScreen("game_screen");
          resume();
          bought = true;
          setProperty("get_butterfly", "text", ("Bought"));
        });
      }
      colorChange();
      update();
    }
    function colorChange(){
      if((score >= butterflyCost) && (bought == false)){
        setProperty("get_butterfly","background-color","green");
      }
      if((score < butterflyCost) || (bought == true)){
        setProperty("get_butterfly","background-color","gray");
      }
    }
  }

//Frog Photo [https://www.hiclipart.com/free-transparent-background-png-clipart-niwhq]
//Butterfly Photo [https://www.kissclipart.com/monarch-clipart-monarch-butterfly-clip-art-3kbnew/]