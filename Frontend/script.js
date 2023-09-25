const sub = document.getElementById('submit');
const url = "http://localhost:8080/formulario"
var obj = new Object();

sub.addEventListener('click', function(evento){
    evento.preventDefault()

    console.log(getPessoa())
    addPessoa(obj)
})

function getPessoa(){
    
    obj.nome = document.getElementById("nome").value;
    obj.email = document.getElementById("email").value;
    obj.telefone = document.getElementById("telefone").value;
    obj.data_nasc = document.getElementById("anoNascimento").value;
    var busca = document.getElementById("genero")
    for(var i = 0; i < busca.length; i++){            
        if(busca[i].checked && busca[i].value == "Masculino"){            
            obj.sexo = "Masculino"
        }
        else if(busca[i].checked && busca[i].value == "Feminino")
        {
            obj.sexo = "Feminino"
        }
        else if(busca[i].checked && busca[i].value == "Outro"){
            obj.sexo = "Outro"
        }
    }
    obj.cidade = document.getElementById("cidade").value;
    obj.estado = document.getElementById("estado").value;
    obj.endereco = document.getElementById("endereco").value;

    return obj;
}

function addPessoa(objeto){
    fetch(url,{
        method: "POST",
        body:JSON.stringify(objeto),
        headers:{
            "Content-type": "application/json; charset=UTF-8"
        }

    })
    .then(response => response.json())
    .then(data => alertApi.textContent = data)
    .catch(error => console.error(error))
}
