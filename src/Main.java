public class Main {

    public static double aumenSalario(Empleado empleado){
        return (empleado.getSalarioMensual()*10)/100 + empleado.getSalarioMensual();
    }

    public static double anualSalario(Empleado empleado){
        return empleado.getSalarioMensual()*12;
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Deimar","Lopez",100);
        Empleado empleado2 = new Empleado("Deniseth","Gonzales",1200);

        System.out.println("Salario antes del aumento"+empleado1.getSalarioMensual());
        empleado1.setSalarioMensual(aumenSalario(empleado1));
        empleado2.setSalarioMensual(aumenSalario(empleado2));
        System.out.println("Salario despues del aumento"+empleado1.getSalarioMensual());
        System.out.println("salario anual "+ anualSalario(empleado1));
        System.out.println("Nuemro de emplados " + Empleado.nEpleado);

    }
}