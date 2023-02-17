let myname = "who am i";
console.log(myname);

let age: number;
age = 40;
console.log('age', age);

//spread operator, to combine array
let arr1 = [1,2,3];
let arr2 = [...arr1,4,5,6];
let arr3 = [10,11, ...arr1];
console.log(arr2);
console.log(arr3);

// template string/interpolation
let word = `my name is ${myname} and my age is ${age}`;
let word2 = 'my name is ' + myname + " and my age is " + 'age';
console.log(word, word2);