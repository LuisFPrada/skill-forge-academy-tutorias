$(document).ready(function() {

});



async function registrarTutorias() {
    $('#txtFechaTutoria').attr('type', 'text');
    $('#txtHoraTutoria').attr('type', 'text');


    let datos = {};
    datos.nombreTutoria = $('#txtNombreTutoria').val();
    datos.fecha = $('#txtFechaTutoria').val();
    datos.hora = $('#txtHoraTutoria').val();

    console.log(datos);

const request = await fetch('api/tutorias', {
    method: 'POST',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
});

if (request.status === 400) {
    // La API devolvió un error
    alert(request.response.error);
} else {
    // La API devolvió una respuesta exitosa
}

//window.location.href = 'perfilTutor.html'

}