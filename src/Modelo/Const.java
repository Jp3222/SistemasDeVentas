package Modelo;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Const {

    public static class ConstBD {

        private final static String[] userInfo = {"user", "nombre", "ap", "am", "edad", "cargo", "password"};
        private final static String[] prodInfo = {"", "", "", "", "", "", ""};
        private final static String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        /**
         *
         * @return retorna un array con los campos de la tabla Usuarios
         */
        public static String[] getUserInfo() {
            return userInfo;
        }

        /**
         * @param i index del campo buscando Tamaño del array 7 campos: 0 - user
         * 1 - nombre 2 - Ap 3 - Am 4 - Edad 5 - Cargo 6 - Password
         * @return retorna el campo dado
         */
        public static String getUser(int i) {
            return userInfo[i];
        }

        public static String[] getDias() {
            return dias;
        }

        public static int UserColumns() {
            return 7;
        }

        public static int prodColumns() {
            return 7;
        }

    }

    /**
     * Constantes para la construccion del sistema
     */
    public static class ConstSistem {

        /**
         *
         * @return retorna un borde negro
         */
        public static Border BordeCorrecto() {
            return new LineBorder(Color.black);
        }

        /**
         *
         * @return retorna un borde rojo
         */
        public static Border BordeInCorrecto() {
            return new LineBorder(Color.red);
        }

    }
}
