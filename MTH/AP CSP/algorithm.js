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
