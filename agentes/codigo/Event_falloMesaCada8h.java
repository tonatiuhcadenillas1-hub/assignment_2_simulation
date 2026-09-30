// Evento: falloMesaCada8h
// Trigger: timeout, modo ciclico. Primera ocurrencia: 240 min. Recurrencia: 480 min
if (habilitarFallas) {
    fallosMesa++;
    mesaEnReparacion = true;
    Mesa_Pruebas.set_capacity((escenarioOptimizado ? 2 : 1) - 1);
}
