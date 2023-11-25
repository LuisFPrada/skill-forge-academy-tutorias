$(document).ready(function() {
//on ready
});


async function registrarTutores() {
  let datos = {};

  datos.experienciaEducativa = document.getElementById('txtexperienciaEducativa').value;
  datos.areasEspecializacion = document.getElementById('txtareasEspecializacion').value;
  datos.tarifaPorHora = document.getElementById('txttarifaPorHora').value;


  const request = await fetch('api/tutores', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  alert("La cuenta fue actualizada con exito!");
  window.location.href = 'perfilTutor.html'

}

