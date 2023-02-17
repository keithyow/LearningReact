var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
var myname = "who am i";
console.log(myname);
var age;
age = 40;
console.log('age', age);
//spread operator, to combine array
var arr1 = [1, 2, 3];
var arr2 = __spreadArray(__spreadArray([], arr1, true), [4, 5, 6], false);
var arr3 = __spreadArray([10, 11], arr1, true);
console.log(arr2);
console.log(arr3);
// template string/interpolation
var word = "my name is ".concat(myname, " and my age is ").concat(age);
var word2 = 'my name is ' + myname + " and my age is " + 'age';
console.log(word, word2);
