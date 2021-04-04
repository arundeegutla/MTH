document.addEventListener("visibilitychange", function() {
    if (document.hidden){
        console.log("Browser tab is hidden")
    } else {
        console.log("Browser tab is visible")
    }
});
targetElement.onscroll = (event) => {
    // handle the scroll event
    console.log("Browser tab is hidden")
};