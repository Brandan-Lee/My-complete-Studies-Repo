// Methods have a parentheses at the end
let course = "JavaScript 101: Coding for beginners"
course.search("Coding");
course.slice(16, 22);
course.substring(16, 6);
course.replace("coding", "Programming");
course = course.replace("coding", "Programming");
course.toUpperCase();
course.toLowerCase();

const spacy = "         lots of spaces      ";
spacy.trim();

const words = course.split(" ");

// Properties do not have a parentheses at the end
course.length;
course[9];
course[0];
course[35];