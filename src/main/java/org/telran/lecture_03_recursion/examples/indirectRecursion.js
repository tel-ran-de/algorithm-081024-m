function functionA(number) {
    console.log("functionA: " + number);
    if (number > 0) {
        functionB(number - 1);
    }
}

function functionB(number) {
    console.log("functionB: " + number);
    if (number > 0) {
        functionA(number - 1);
    }
}

functionA(3);