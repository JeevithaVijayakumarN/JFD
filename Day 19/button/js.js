let options=[
    'hello world'
];
function help(){
    let randomOptionNum=Math.floor(Math.random()*options.length);
    document.getElementById('doThis').innerHTML=options[randomOptionNum];
}