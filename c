Algoritmo CalculoPromedios
	Escribir 'Ingrese el numero de calificaciones: '
	Leer x
	Escribir 'La cantidad de calificaciones es: ',x
	SumaT <- 0
	Para i<-1 Hasta x Hacer
		Escribir 'Ingrese la calificacion no. ',i
		Leer Calif
		SumaT <- SumaT+Calif
	FinPara
	Pro <- SumaT/x
	Escribir 'El promedio es de: ',Pro
FinAlgoritmo

#include<stdio.h>

int main() {
    int alumnos, pro;
    float mayorpro, proH, proM, sumaH, sumaHombres, sumaM, sumaMujeres;
    char sexo;

    printf("Ingrese la cantidad de alumnos: \n");
    scanf("%i", &alumnos);
    printf("La cantidad de alumnos es: %i\n", alumnos);

    sumaMujeres = 0;
    sumaHombres = 0;

    for (int i = 1; i <= alumnos; i ++) {
        printf("Ingrese el sexo del alumno %i (F/M)\n", i);
        scanf("%s", &sexo);
        printf("Ingrese el promedio: \n");
        scanf("%i", &pro);

        if (sexo == 'M') {
                sumaHombres = sumaHombres + 1;
                sumaH = sumaH + pro;
        } else {
            if (sexo == 'F') {
                sumaMujeres = sumaMujeres + 1;
                sumaM = sumaM + pro;
            }
        }
    }

    proM = sumaM / sumaMujeres;
    proH = sumaH / sumaHombres;

    printf("El promedio de las mujeres es: %.2f\n", proM);
    printf("El promedio de los hombres es: %.2f\n", proH);
    if (proH > proM) {
        printf("El sexo con mayor promedio es: Masculino\n");
    } else {
        if (proM>proH) {
        printf("El sexo con mayor promedio es: Femenino\n");
		}
    }
    printf("Hombres: %.0f\n", sumaHombres);
    printf("Mujeres: %.0f\n", sumaMujeres);

    return 0;
}

#include <stdio.h>

int main() {
int x;
float SumaT = 0;
float Pro;
printf("Ingrese el numero de calificaciones: ");
scanf("%d", &x);
printf("La cantidad de calificaciones es: %d\n", x);

for (int i = 1; i <= x; i++) {
    printf("Ingrese la calificacion no. %d: ", i);
    float Calif;
    scanf("%f", &Calif);
    SumaT += Calif;
}

Pro = SumaT / x;

printf("El promedio es de: %.2f\n", Pro);

return 0;
}

