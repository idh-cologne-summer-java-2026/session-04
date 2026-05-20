
public class Main {

	public static void main(String[] args) {
		StringList sl = new StringList(3);
		sl.add(new ExampleClass());
		sl.add(new ExampleClass());
		sl.add(new ExampleClass());
		sl.add(new ExampleClass());
		sl.add(new ExampleClass());
		System.out.println(sl);
		
		GenericList<String> gl = new GenericList<String>(3);
		gl.add("Hallo");
		gl.add("blubb");
		gl.add("blubb");
		gl.add("blubb");
		gl.add("blubb");
		gl.add("blubb");
		gl.add("blubb");
		gl.add("blubb");
		System.out.println(gl);

		GenericList<ExampleClass> gl2 = new GenericList<ExampleClass>(1);
		gl2.add(new ExampleClass());
		gl2.add(new ExampleClass());
		gl2.add(new ExampleClass());
		gl2.add(new ExampleClass());
		gl2.add(new ExampleClass());
		gl2.add(new ExampleClass());
		gl2.add(new ExampleClass());
		gl2.add(new ExampleClass());
		System.out.println(gl2);
		
		GenericList<Object> gl3 = new GenericList<Object>(1);


	}

}
