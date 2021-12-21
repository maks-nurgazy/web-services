# web-services

<h2>Annotations</h2>:
    <h5> We can create own annotation by *@interface AnnotationName*. After that 
        we can get that value using *Reflection library*. 2 types of annotations we have:
        1) MARKER
        2) FILLED
    </h5> 
    <p><b>@Autowired</b> - it auto wires need dependency</p>
    <p><b>@RestController</b> - it's same as RestController and ResponseBody annotation</p>
    <p><b>@FunctionalInterface</b> - intended to be a functional interface. Has exactly one abstract method</p>
    <p><b>@Override</b> - It informs us specified method exists or not in parent class. If it's not specified 
        then we have change to type different name than parent class have.</p>
    <p><b>@ResponseStatus</b> - if we need to change status of HTTP response</p>
    <p><b>@ExceptionHandler</b> - For custom exception handling we extend *ResponseEntityExceptionHandler* and 
            annotate method with @ExceptionHandler.
    </p>

