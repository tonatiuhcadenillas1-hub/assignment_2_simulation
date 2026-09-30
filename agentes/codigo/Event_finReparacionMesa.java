// Evento: finReparacionMesa
// Trigger: timeout, modo ciclico. Primera ocurrencia: 255 min. Recurrencia: 480 min
if (habilitarFallas) {
    Mesa_Pruebas.set_capacity(escenarioOptimizado ? 2 : 1);
    mesaEnReparacion = false;
}
