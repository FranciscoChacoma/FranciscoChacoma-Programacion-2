public class Persona {
    private String nombre;
    private String apellido;
    private String DNI;
    private int edad;
    private String direccion;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String DNI, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        if (edad < 0)
        {
            System.out.println("Error: La Edad no puede ser menor a 0");
            this.edad = 777777; // quiero poner edad invalida o algo
        }
        else
        {
            this.edad = edad;
        }

        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre()
    {
     return nombre;
    }

    public void setnombre(String nombre)
    {
        if (nombre != null && !nombre.trim().isEmpty())
        {
            this.nombre = nombre;
        }
        else
        {
            System.out.println("Error: El Nombre no puede ser nulo");
            this.nombre = "???";
        }
    }

    public void setEdad(int edad)
    {
        if(edad < 0)
        {
            System.out.println("AAAAA");

        }
        else
        {
            this.edad = edad;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}