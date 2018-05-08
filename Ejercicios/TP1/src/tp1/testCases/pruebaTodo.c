int a = 0;
int b;
double c, d=1, e;

void vacio();
void parametros(int a, int b);
int vaciotipo(); 
double  parametrostipo(int a, double b);


int pruebaFuncValor(){
    int a = 0;
    double b = 15/2;
    a = 10 + 15 / b;

    while (a>b){
        a++;
    }
    for(int d =0, b=1; b*2>d+1; d++){
        d+=5;
    }
    return 0;
}
 

void pruebaFuncVoid(){
    return;
}
