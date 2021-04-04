    




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

    //Changes the animal position
    function move(){
      if (object == "frog") {
        setPosition(object, randomNumber(0,220), randomNumber(245, 310));
      } else if (object == "butterfly"){
        setPosition(object, randomNumber(0,220), randomNumber(75, 310));
      }
    }

    //Moves the animal automatically
    function timer(num) {
      timedLoop(num, move);
    }


    //Refreshes the User Interface
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









