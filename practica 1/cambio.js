function mostrar(){
	document.getElementById("objeto").style.display= "block";
}

function ocultar(){
	document.getElementById("objeto").style.display= "none"
}

function mostrar_ocultar(){
	var objeto= document.getElementById("objeto");
	
	if(objeto.style.display == "none"){
		mostrar();
		document.getElementById("button").value= "Ocultar";
	}
	else{
		ocultar();
		document.getElementById("button").value= "Mostrar";
	}
	

}



function nocturno(){
	document.getElementById("fondo").style.background="black";
}

