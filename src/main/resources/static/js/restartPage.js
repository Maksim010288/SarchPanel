const check = document.querySelector(".check");

function restart(){
    document.location.reload();
}


if (check.checked()) {
    timeout = setTimeout(restart, 1000)
}else {
    clearTimeout(timeout)
}
