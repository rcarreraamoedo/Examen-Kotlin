fun main(){
    var unaaparcamiento = aparcamiento("Plaza Marroca",15,2)
    println("1º primer aparcamiento: Nombre => "+unaaparcamiento.nombre+", Hora de entrada => "+unaaparcamiento.plazaTotales+", Hora de salida => "+unaaparcamiento.plazaLibre)
    //Se objeto llamado unaaparcamiento añadir valores a los atributos y luego se visualiza esos atributos respectivamente
        var primercoche = Coches("ABCF-65","4:50","5:13")
        //Se realiza los mismos pasos para los atributos de coche dentro de nuestra propia simulación de la clase aparacamiento.
        //Según a la estructura diseñada en Coches
        println("1º Primer coche")
        println("Matricula -> "+primercoche.matricula)
        println("Hora de entrada -> "+primercoche.horaentrada)
        println("Hora de salida -> "+primercoche.horasalida)
        var segundocoche = Coches("VFGR-4832","15:56","16:43")
        println("2º Primer coche")
        println("Matricula -> "+segundocoche.matricula)
        println("Hora de entrada -> "+segundocoche.horaentrada)
        println("Hora de salida -> "+segundocoche.horasalida)
        //Lo miso se hace con el resto de aparcamientos
    var segundoaparcamiento = aparcamiento("Calle Urzáiz",20,3)
    println("2º primer aparcamiento: Nombre => "+segundoaparcamiento.nombre+", Hora de entrada => "+segundoaparcamiento.plazaTotales+", Hora de salida => "+segundoaparcamiento.plazaLibre)
        var tercercoche = Coches("BNF43","4:32","6:45")
        println("1º Primer coche")
        println("Matricula -> "+tercercoche.matricula)
        println("Hora de entrada -> "+tercercoche.horaentrada)
        println("Hora de salida -> "+tercercoche.horasalida)
    var cuartocoche = Coches("JKBHD-54","1:21","2:20")
        println("2º Primer coche")
        println("Matricula -> "+cuartocoche.matricula)
        println("Hora de entrada -> "+cuartocoche.horaentrada)
        println("Hora de salida -> "+cuartocoche.horasalida)
    var terceraparcamiento = aparcamiento("Rua Peninsula",14,2)
     var quintocoche = Coches("NJDFBD-43434","12:54","13:45")
        println("3º primer aparcamiento: Nombre => "+terceraparcamiento.nombre+", Hora de entrada => "+terceraparcamiento.plazaTotales+", Hora de salida => "+terceraparcamiento.plazaLibre)
        println("1º Primer coche")
        println("Matricula -> "+quintocoche.matricula)
        println("Hora de entrada -> "+quintocoche.horaentrada)
        println("Hora de salida -> "+quintocoche.horasalida)
        var sextocoche = Coches("ND-654","13:56","14:00")
        println("2º Primer coche")
        println("Matricula -> "+sextocoche.matricula)
        println("Hora de entrada -> "+sextocoche.horaentrada)
        println("Hora de salida -> "+sextocoche.horasalida)
    //Como se puede comprobar, todos las variables han sido declaradas y mostrar por pantalla.
    //El resto de la sentecia es realmente parecida al primer ejemplo de primer aparcamiento
}