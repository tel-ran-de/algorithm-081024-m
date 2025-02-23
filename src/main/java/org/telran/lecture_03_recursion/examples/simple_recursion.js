function iteration(n) {
    for (let i = 0; i <= n; i++) {
        console.log("n = " + i);
    }
}

function recursion(n) {
    if (n >= 0) {
        recursion(n - 1);
        console.log("n = " + n);
    }
}

// console.log("----------iteration----------");
// iteration(5);
console.log("----------recursion----------");
recursion(5);
