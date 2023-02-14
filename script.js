const sub = document.getElementById('submit');

sub.addEventListener('click', evento =>{

    evento.preventDefault();

    console.log(document.getElementById('nome').value)
})