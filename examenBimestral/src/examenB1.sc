case class Ciudad(nombre: String, temps: List[Double])
val ciudades: List[Ciudad] = List(
  Ciudad("Loja",       List(18.0, 19.2, 17.5, 20.1, 21.0, 18.7, 19.3)),
  Ciudad("Quito",      List(12.5, 13.2, 14.1, 13.8, 14.0, 13.4, 12.9)),
  Ciudad("Cuenca",     List(15.5, 16.3, 15.1, 17.0, 16.8, 15.9, 16.0)),
  Ciudad("Guayaquil",  List(25.0, 26.5, 27.1, 28.3, 29.0, 28.5, 27.8)),
  Ciudad("Manta",      List(23.5, 24.0, 25.1, 25.0, 24.8, 24.9, 23.9)),
  Ciudad("Tulcán",     List( 9.5, 10.2, 11.0, 10.8, 10.9, 10.5,  9.9)),
  Ciudad("Tena",       List(20.5, 21.0, 22.1, 23.0, 22.7, 21.9, 21.5)),
  Ciudad("Zamora",     List(19.0, 20.1, 21.0, 22.3, 22.0, 21.4, 20.7)),
  Ciudad("Ibarra",     List(14.0, 14.5, 15.2, 15.1, 14.8, 14.3, 13.9)),
  Ciudad("Latacunga",  List(13.5, 14.1, 14.7, 14.8, 14.4, 14.0, 13.6)),
  Ciudad("Machala",    List(24.5, 25.0, 25.8, 26.2, 26.5, 26.0, 25.7)),
  Ciudad("Portoviejo", List(23.8, 24.2, 24.9, 25.3, 25.6, 25.1, 24.7)),
  Ciudad("Esmeraldas", List(26.0, 26.5, 27.0, 27.8, 28.2, 27.9, 27.1)),
  Ciudad("Ambato",     List(12.8, 13.3, 13.9, 14.1, 13.7, 13.4, 13.0)),
  Ciudad("Riobamba",   List(11.5, 12.1, 12.8, 13.0, 12.7, 12.3, 11.9)),
  Ciudad("Quevedo",    List(24.0, 24.7, 25.3, 25.9, 26.1, 25.8, 25.2)),
  Ciudad("Santo Domingo", List(23.2, 23.9, 24.5, 25.0, 25.3, 24.9, 24.4)),
  Ciudad("Salinas",    List(22.0, 22.5, 23.0, 23.4, 23.6, 23.1, 22.7)),
  Ciudad("Macas",  List(17.2, 18.0, 17.8, 18.5, 18.9, 18.3, 17.9)),
  Ciudad("Puyo",       List(21.0, 21.6, 22.2, 22.9, 23.1, 22.7, 22.0))
)
//Tomar la lista ciudades y quedarse únicamente con aquellas ciudades cuya lista temps tenga tamaño mayor o igual a 5.
val ciudadestemps = ciudades.filter(_.temps.size>= 5)
// para cada ciudad  valida, calcular la diferencia entre la temperatura maxima y la minima  de su lista temps
def calcularMaximo(temperaturas: List[Double]): Double = {
  if (temperaturas.isEmpty) {
    println("La lista de temperaturas está vacía")
  }

  var maximo = temperaturas(0)
  var i = 1
  while (i < temperaturas.length) {
    if (temperaturas(i) > maximo) {
      maximo = temperaturas(i)
    }
    i += 1
  }
  maximo
}
def calcularMinimo(temperaturas: List[Double]): Double = {
  if (temperaturas.isEmpty) {
    println("La lista de temperaturas está vacía")
  }

  var minimo = temperaturas(0)
  var i = 1
  while (i < temperaturas.length) {
    if (temperaturas(i) < minimo) {
      minimo = temperaturas(i)
    }
    i += 1
  }
  minimo
}

def calcularVariacion(ciudad: Ciudad): Double = {
  val maximo = calcularMaximo(ciudad.temps)
  val minimo = calcularMinimo(ciudad.temps)
  maximo - minimo
}
var ciudadMaxVariacion = ciudadestemps(0)
var maxVariacion = calcularVariacion(ciudadMaxVariacion)

var i = 1
while (i < ciudadestemps.length) {
  val ciudadActual = ciudadestemps(i)
  val variacionActual = calcularVariacion(ciudadActual)

  if (variacionActual > maxVariacion) {
    maxVariacion = variacionActual
    ciudadMaxVariacion = ciudadActual
  }

  i += 1
}
println("=" * 60)
println("ANÁLISIS DE VARIACIÓN TÉRMICA")
println("=" * 60)
println(s"Ciudad con mayor variación térmica: ${ciudadMaxVariacion.nombre}")
println(f"Variación térmica: $maxVariacion%.2f °C")
println(s"Temperatura máxima: ${calcularMaximo(ciudadMaxVariacion.temps)} °C")
println(s"Temperatura mínima: ${calcularMinimo(ciudadMaxVariacion.temps)} °C")
println("=" * 60)


