document.getElementById("slider").addEventListener("input", function() {
    const length = this.value;
    document.getElementById("length").textContent = length;
});
function validate(){
    const name = document.getElementById("name").value;
    const password = document.getElementById("password").value;
    const email = document.getElementById("email").value;
    document.getElementById("text").innerHTML = name+" "+password+" "+email;
    let upper = /[A-Z]/;
    let lower = /[a-z]/;
    let digit = /[0-9]/;
    let special = /[^A-Za-z0-9]/;
    if(password.length>=8 && upper.test(password)&& lower.test(password) && digit.test(password)&& special.test(password)){
        document.getElementById("pass").innerHTML = "Password validated";
    }else{
        document.getElementById("pass").innerHTML = "Password wrong";
    }
    let pattern  = /^[A-Za-z]{3,}$/
    if(pattern.test(name)){
        alert("Valid name");
    }else{
        alert("Invalid name");
    }
    let emailpattern = /^[^\s@]+@[^\s@]+.[^\s@]+$/;
    if(emailpattern.test(email)){
        alert("Valid email");
    }else{
        alert("invalid email");
    }


}