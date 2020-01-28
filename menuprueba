//Menu
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hundir la flota");
        System.out.println("¿Qué dimensión de tablero quieres?");
        int size = sc.nextInt();
        Tablero tablero = new Tablero();
        tablero.crearTablero(size);
        System.out.println("Se ha creado un tablero de dimensión" + size + "*" + size);
        int opcion;
        boolean salir = false;

        while (!salir) {
            try {
                System.out.println("--------MENÚ--------");
                System.out.println("1) Colocar barcos");
                System.out.println("2) Mostrar tablero");
                System.out.println("3) Disparar");
                System.out.println("4) Salir");
                System.out.println("--------------------");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:

                        break;
                    case 2:
                        tablero.mostrarTablero();
                        break;
                    case 3:

                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }

    }
