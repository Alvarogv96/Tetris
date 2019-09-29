public class Reglas {
    public boolean permisoDesplazamintoDer(int [][] matrizCoords){
        boolean permiso = true;

        for(int i = 0; i < matrizCoords.length; i++){
            if (matrizCoords[i][0] > 10){
                permiso = false;
            }
        }

        return permiso;
    }

    public boolean permisoDesplazamintoIzq(int [][] matrizCoords){
        boolean permiso = true;

        for(int i = 0; i < matrizCoords.length; i++){
            if (matrizCoords[i][0] < 0){
                permiso = false;
            }
        }

        return permiso;
    }

    public boolean topeInferior(int [][] matrizCoords){
        boolean tope = false;

        for (int i = 0; i < matrizCoords.length; i++){
            if(matrizCoords[i][1] > 23){
                tope = true;
            }
        }
        return tope;
    }

    public void filaCompleta (int [][] matrizTablero){
        for (int i = matrizTablero.length; i > 0; i--){
            boolean incompleta = false;
            for(int j = 0; j < matrizTablero.length; j++){
                if(matrizTablero[i][j] == 0){
                    incompleta = true;
                }
            }
            if(!incompleta){
                //Juego.boorarFila(j);
            }
        }
    }

}
