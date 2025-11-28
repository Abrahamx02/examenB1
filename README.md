ciudadConMayorVariacion(ciudades) match {
  case Some((ciudad, variacion)) =>
    println("=" * 60)
    println("ANÁLISIS DE VARIACIÓN TÉRMICA")
    println("=" * 60)
    println(s"Ciudad con mayor variación térmica: ${ciudad.nombre}")
    println(f"Variación térmica: $variacion%.2f °C")
    println(s"Temperatura máxima: ${calcularMaximo(ciudad.temps)} °C")
    println(s"Temperatura mínima: ${calcularMinimo(ciudad.temps)} °C")
    println("=" * 60)

  case None =>
    println("No hay ciudades con suficientes mediciones.")
}
