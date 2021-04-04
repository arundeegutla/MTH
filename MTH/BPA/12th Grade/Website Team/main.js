var x = window.matchMedia("(min-width: 870px)")
window.addEventListener("scroll", function(){
    var header = document.querySelector("header");
    header.classList.toggle("sticky", window.scrollY>65);
    header.classList.toggle("inView", window.scrollY>70);
    header.classList.toggle("navtran", window.scrollY<70);
    header.classList.toggle("navtranfin", window.scrollY<65);
})