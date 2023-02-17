console.log("Helloooooo from da terminaaaaaaaaaaaaaaaaaaaaaaaal");

let names = ["hi", "its", "me", 34, true];

console.log("Name = " + names[2]);

//loop in js
for (let i = 0; i <names.length; i++){
    console.log(i);
}

//callback func or anonymous func
names.forEach((val) => {console.log(val)})