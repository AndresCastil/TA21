package com.UD21.UD21_MavenProject;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.UD21.UD21_MavenProject.App;
import com.UD21.UD21_MavenProject.Geometria;
import static org.junit.jupiter.api.Assertions.*;

public class GeometriaTest {
	
	Geometria geo = new Geometria();
    
	 @Test
	 public void testareacuadrado( ){
			int resultado = geo.areacuadrado(2);
			int esperado = 4;
			assertEquals(esperado, resultado);
			}
	 
	 @SuppressWarnings("deprecation")
	public void testareaCirculo( ){
			double resultado = geo.areaCirculo(2);
			double  esperado = 12.56;
			assertEquals(esperado, resultado);
			}
	 @Test
	 public void testareatriangulo(){
		 int resultado = geo.areatriangulo(4, 6);
			int esperado = 12;
			assertEquals(esperado, resultado);
			}
}
