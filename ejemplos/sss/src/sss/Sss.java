import java.util.ArrayList;
import java.util.List;

// Clase base abstracta para los transportes
public abstract class Transporte {
    protected String nombre;
    protected double tarifaPorKm;

    public Transporte(String nombre, double tarifaPorKm) {
        this.nombre = nombre;
        this.tarifaPorKm = tarifaPorKm;
    }

    public abstract double calcularCosto(double distancia);

    public String getNombre() {
        return nombre;
    }
}

// Clase derivada Clipp
public class Clipp extends Transporte {
    public Clipp() {
        super("Clipp", 1.0); // Tarifa ficticia por km
    }

    @Override
    public double calcularCosto(double distancia) {
        return distancia * tarifaPorKm;
    }
}

// Clase derivada Ktaxi
public class Ktaxi extends Transporte {
    public Ktaxi() {
        super("Ktaxi", 1.5); // Tarifa ficticia por km
    }

    @Override
    public double calcularCosto(double distancia) {
        return distancia * tarifaPorKm;
    }
}

// Clase derivada Situ
public class Situ extends Transporte {
    public Situ() {
        super("Situ", 0.3); // Tarifa fija por uso
    }

    @Override
    public double calcularCosto(double distancia) {
        return 0.3; // Costo fijo independiente de la distancia
    }
}

// Clase derivada BusUTPL
public class BusUTPL extends Transporte {
    public BusUTPL() {
        super("Bus UTPL", 0.0); // Gratuito
    }

    @Override
    public double calcularCosto(double distancia) {
        return 0.0; // Servicio gratuito
    }
}

// Clase Usuario
public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}

// Clase Reserva
public class Reserva {
    private Usuario usuario;
    private Transporte transporte;
    private double distancia;
    private double costo;

    public Reserva(Usuario usuario, Transporte transporte, double distancia) {
        this.usuario = usuario;
        this.transporte = transporte;
        this.distancia = distancia;
        this.costo = transporte.calcularCosto(distancia);
    }

    public void mostrarDetalle() {
        System.out.println("Reserva de " + usuario.getNombre() + " (" + usuario.getEmail() + ")");
        System.out.println("Transporte: " + transporte.getNombre());
        System.out.println("Distancia: " + distancia + " km");
        System.out.println("Costo: $" + costo);
    }
}

// Clase principal del sistema de movilidad
public class SistemaMovilidad {
    private List<Transporte> transportes;
    private List<Usuario> usuarios;
    private List<Reserva> reservas;

    public SistemaMovilidad() {
        transportes = new ArrayList<>();
        usuarios = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void agregarTransporte(Transporte transporte) {
        transportes.add(transporte);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarReserva(Usuario usuario, Transporte transporte, double distancia) {
        Reserva reserva = new Reserva(usuario, transporte, distancia);
        reservas.add(reserva);
        reserva.mostrarDetalle();
    }

    public static void main(String[] args) {
        // Crear el sistema de movilidad
        SistemaMovilidad sistema = new SistemaMovilidad();

        // Crear y agregar transportes
        sistema.agregarTransporte(new Clipp());
        sistema.agregarTransporte(new Ktaxi());
        sistema.agregarTransporte(new Situ());
        sistema.agregarTransporte(new BusUTPL());

        // Registrar usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", "juan@example.com");
        Usuario usuario2 = new Usuario("María Gómez", "maria@example.com");
        sistema.registrarUsuario(usuario1);
        sistema.registrarUsuario(usuario2);

        // Realizar reservas
        sistema.realizarReserva(usuario1, new Clipp(), 10.0);
        sistema.realizarReserva(usuario2, new Ktaxi(), 5.0);
    }
}
