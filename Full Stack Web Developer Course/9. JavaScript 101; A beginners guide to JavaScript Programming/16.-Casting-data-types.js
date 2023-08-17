let age = "31";
typeof(age); //string

Number(age);
typeof(age); //Will still return that age is a string

age = Number(age);
typeof(age); //Number

age = Object(age);
typeof(age); //Object

age = Array(age);
typeof(age); //This will create an array with the length of 31

Boolean(31); //Returns true
Boolean(0); //Returns false