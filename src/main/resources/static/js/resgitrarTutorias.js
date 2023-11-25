$(document).ready(function() {
   // on ready
});


async function registrarTutorias() {
  let datos = {};
  datos.nombre = document.getElementById('txtNombreTutoria').value;
  datos.apellido = document.getElementById('txtFechaTutoria').value;
  datos.email = document.getElementById('txtHoraTutoria').value;
  datos.telefono = document.getElementById('txtNumerodeTelefóno').value;
  datos.password = document.getElementById('txtPassword').value;

  let repetirPassword = document.getElementById('txtRepetirPassword').value;

  if (repetirPassword != datos.password) {
    alert('La contraseña que escribiste es diferente.');
    return;
  }

  const request = await fetch('api/usuarios', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  alert("La tutoria fue creada con exito");
  window.location.href = 'index.html'

}