function displayCurrentTime() {
    var time = new Date();
    var fullTime = time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds();
    // console.log(fullTime);
    document.getElementById('currentTime').innerHTML = fullTime;
    setTimeout(displayCurrentTime, 1000);
}

function displayFacebookMessage() {
    window.alert("A súgó sajnos nem működik! :'(")
}