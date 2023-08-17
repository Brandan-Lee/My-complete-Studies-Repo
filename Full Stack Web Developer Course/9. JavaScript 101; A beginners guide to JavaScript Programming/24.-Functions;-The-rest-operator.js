function addNumbers(greetingName, ...numbers) {
    let total = 0;

    for (index in numbers) {
        total += Number(numbers[index]);
    }
    
    return `Hello ${String(greetingName)}: the total is ${total}`;
}

const newTotal = addNumbers("Brandan-Lee", 1, 4, 7, 213);
console.log(newTotal);