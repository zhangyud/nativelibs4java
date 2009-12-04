package com.nativelibs4java.opencl.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cl_long16 extends com.ochafik.lang.jnaerator.runtime.Union<cl_long16, cl_long16.ByValue, cl_long16.ByReference> {
	/// C type : cl_long[16]
	public long[] i64 = new long[(16)];
	public cl_long16() {
		super();
	}
	/// @param i64 C type : cl_long[16]
	public cl_long16(long i64[]) {
		super();
		if (i64.length != this.i64.length) 
			throw new java.lang.IllegalArgumentException("Wrong array size !");
		this.i64 = i64;
		setType(long[].class);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected cl_long16 newInstance() { return new cl_long16(); }
	public static cl_long16[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Union.newArray(cl_long16.class, arrayLength);
	}
	public static class ByReference extends cl_long16 implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends cl_long16 implements com.sun.jna.Structure.ByValue {}
}