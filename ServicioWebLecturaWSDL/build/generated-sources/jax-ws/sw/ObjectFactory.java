
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Diccionario_QNAME = new QName("http://sw/", "Diccionario");
    private final static QName _DiccionarioResponse_QNAME = new QName("http://sw/", "DiccionarioResponse");
    private final static QName _Division_QNAME = new QName("http://sw/", "Division");
    private final static QName _DivisionResponse_QNAME = new QName("http://sw/", "DivisionResponse");
    private final static QName _Login_QNAME = new QName("http://sw/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://sw/", "LoginResponse");
    private final static QName _Multiplicacion_QNAME = new QName("http://sw/", "Multiplicacion");
    private final static QName _MultiplicacionResponse_QNAME = new QName("http://sw/", "MultiplicacionResponse");
    private final static QName _Npotencia_QNAME = new QName("http://sw/", "Npotencia");
    private final static QName _NpotenciaResponse_QNAME = new QName("http://sw/", "NpotenciaResponse");
    private final static QName _PARIMPAR_QNAME = new QName("http://sw/", "PAR_IMPAR");
    private final static QName _PARIMPARResponse_QNAME = new QName("http://sw/", "PAR_IMPARResponse");
    private final static QName _Resta_QNAME = new QName("http://sw/", "Resta");
    private final static QName _RestaResponse_QNAME = new QName("http://sw/", "RestaResponse");
    private final static QName _Suma_QNAME = new QName("http://sw/", "Suma");
    private final static QName _SumaResponse_QNAME = new QName("http://sw/", "SumaResponse");
    private final static QName _Hello_QNAME = new QName("http://sw/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://sw/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Diccionario }
     * 
     */
    public Diccionario createDiccionario() {
        return new Diccionario();
    }

    /**
     * Create an instance of {@link DiccionarioResponse }
     * 
     */
    public DiccionarioResponse createDiccionarioResponse() {
        return new DiccionarioResponse();
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Multiplicacion }
     * 
     */
    public Multiplicacion createMultiplicacion() {
        return new Multiplicacion();
    }

    /**
     * Create an instance of {@link MultiplicacionResponse }
     * 
     */
    public MultiplicacionResponse createMultiplicacionResponse() {
        return new MultiplicacionResponse();
    }

    /**
     * Create an instance of {@link Npotencia }
     * 
     */
    public Npotencia createNpotencia() {
        return new Npotencia();
    }

    /**
     * Create an instance of {@link NpotenciaResponse }
     * 
     */
    public NpotenciaResponse createNpotenciaResponse() {
        return new NpotenciaResponse();
    }

    /**
     * Create an instance of {@link PARIMPAR }
     * 
     */
    public PARIMPAR createPARIMPAR() {
        return new PARIMPAR();
    }

    /**
     * Create an instance of {@link PARIMPARResponse }
     * 
     */
    public PARIMPARResponse createPARIMPARResponse() {
        return new PARIMPARResponse();
    }

    /**
     * Create an instance of {@link Resta }
     * 
     */
    public Resta createResta() {
        return new Resta();
    }

    /**
     * Create an instance of {@link RestaResponse }
     * 
     */
    public RestaResponse createRestaResponse() {
        return new RestaResponse();
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diccionario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Diccionario }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Diccionario")
    public JAXBElement<Diccionario> createDiccionario(Diccionario value) {
        return new JAXBElement<Diccionario>(_Diccionario_QNAME, Diccionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiccionarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiccionarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "DiccionarioResponse")
    public JAXBElement<DiccionarioResponse> createDiccionarioResponse(DiccionarioResponse value) {
        return new JAXBElement<DiccionarioResponse>(_DiccionarioResponse_QNAME, DiccionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "DivisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplicacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Multiplicacion")
    public JAXBElement<Multiplicacion> createMultiplicacion(Multiplicacion value) {
        return new JAXBElement<Multiplicacion>(_Multiplicacion_QNAME, Multiplicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "MultiplicacionResponse")
    public JAXBElement<MultiplicacionResponse> createMultiplicacionResponse(MultiplicacionResponse value) {
        return new JAXBElement<MultiplicacionResponse>(_MultiplicacionResponse_QNAME, MultiplicacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Npotencia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Npotencia }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Npotencia")
    public JAXBElement<Npotencia> createNpotencia(Npotencia value) {
        return new JAXBElement<Npotencia>(_Npotencia_QNAME, Npotencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NpotenciaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NpotenciaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "NpotenciaResponse")
    public JAXBElement<NpotenciaResponse> createNpotenciaResponse(NpotenciaResponse value) {
        return new JAXBElement<NpotenciaResponse>(_NpotenciaResponse_QNAME, NpotenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARIMPAR }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PARIMPAR }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "PAR_IMPAR")
    public JAXBElement<PARIMPAR> createPARIMPAR(PARIMPAR value) {
        return new JAXBElement<PARIMPAR>(_PARIMPAR_QNAME, PARIMPAR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARIMPARResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PARIMPARResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "PAR_IMPARResponse")
    public JAXBElement<PARIMPARResponse> createPARIMPARResponse(PARIMPARResponse value) {
        return new JAXBElement<PARIMPARResponse>(_PARIMPARResponse_QNAME, PARIMPARResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Resta")
    public JAXBElement<Resta> createResta(Resta value) {
        return new JAXBElement<Resta>(_Resta_QNAME, Resta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "RestaResponse")
    public JAXBElement<RestaResponse> createRestaResponse(RestaResponse value) {
        return new JAXBElement<RestaResponse>(_RestaResponse_QNAME, RestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "SumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
