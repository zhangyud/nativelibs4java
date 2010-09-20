package com.nativelibs4java.ffmpeg.avcodec;
import com.nativelibs4java.ffmpeg.avcodec.AvcodecLibrary.AVSubtitleType;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : libavcodec/avcodec.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avcodec") 
public class AVSubtitleRect extends StructObject {
	public AVSubtitleRect() {
		super();
	}
	public AVSubtitleRect(Pointer pointer) {
		super(pointer);
	}
	/// < top left corner  of pict, undefined when pict is not set
	@Field(0) 
	public int x() {
		return this.io.getIntField(this, 0);
	}
	/// < top left corner  of pict, undefined when pict is not set
	@Field(0) 
	public AVSubtitleRect x(int x) {
		this.io.setIntField(this, 0, x);
		return this;
	}
	public final int x_$eq(int x) {
		x(x);
		return x;
	}
	/// < top left corner  of pict, undefined when pict is not set
	@Field(1) 
	public int y() {
		return this.io.getIntField(this, 1);
	}
	/// < top left corner  of pict, undefined when pict is not set
	@Field(1) 
	public AVSubtitleRect y(int y) {
		this.io.setIntField(this, 1, y);
		return this;
	}
	public final int y_$eq(int y) {
		y(y);
		return y;
	}
	/// < width            of pict, undefined when pict is not set
	@Field(2) 
	public int w() {
		return this.io.getIntField(this, 2);
	}
	/// < width            of pict, undefined when pict is not set
	@Field(2) 
	public AVSubtitleRect w(int w) {
		this.io.setIntField(this, 2, w);
		return this;
	}
	public final int w_$eq(int w) {
		w(w);
		return w;
	}
	/// < height           of pict, undefined when pict is not set
	@Field(3) 
	public int h() {
		return this.io.getIntField(this, 3);
	}
	/// < height           of pict, undefined when pict is not set
	@Field(3) 
	public AVSubtitleRect h(int h) {
		this.io.setIntField(this, 3, h);
		return this;
	}
	public final int h_$eq(int h) {
		h(h);
		return h;
	}
	/// < number of colors in pict, undefined when pict is not set
	@Field(4) 
	public int nb_colors() {
		return this.io.getIntField(this, 4);
	}
	/// < number of colors in pict, undefined when pict is not set
	@Field(4) 
	public AVSubtitleRect nb_colors(int nb_colors) {
		this.io.setIntField(this, 4, nb_colors);
		return this;
	}
	public final int nb_colors_$eq(int nb_colors) {
		nb_colors(nb_colors);
		return nb_colors;
	}
	/**
	 * data+linesize for the bitmap of this subtitle.<br>
	 * can be set for text/ass as well once they where rendered<br>
	 * C type : AVPicture
	 */
	@Field(5) 
	public com.nativelibs4java.ffmpeg.avcodec.AVPicture pict() {
		return this.io.getNativeObjectField(this, 5);
	}
	/// C type : AVSubtitleType
	@Field(6) 
	public ValuedEnum<AVSubtitleType > type() {
		return this.io.getEnumField(this, 6);
	}
	/// C type : AVSubtitleType
	@Field(6) 
	public AVSubtitleRect type(ValuedEnum<AVSubtitleType > type) {
		this.io.setEnumField(this, 6, type);
		return this;
	}
	/// C type : AVSubtitleType
	public final ValuedEnum<AVSubtitleType > type_$eq(ValuedEnum<AVSubtitleType > type) {
		type(type);
		return type;
	}
	/**
	 * < 0 terminated plain UTF-8 text<br>
	 * C type : char*
	 */
	@Field(7) 
	public Pointer<java.lang.Byte > text() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * < 0 terminated plain UTF-8 text<br>
	 * C type : char*
	 */
	@Field(7) 
	public AVSubtitleRect text(Pointer<java.lang.Byte > text) {
		this.io.setPointerField(this, 7, text);
		return this;
	}
	/// C type : char*
	public final Pointer<java.lang.Byte > text_$eq(Pointer<java.lang.Byte > text) {
		text(text);
		return text;
	}
	/**
	 * 0 terminated ASS/SSA compatible event line.<br>
	 * The pressentation of this is unaffected by the other values in this<br>
	 * struct.<br>
	 * C type : char*
	 */
	@Field(8) 
	public Pointer<java.lang.Byte > ass() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * 0 terminated ASS/SSA compatible event line.<br>
	 * The pressentation of this is unaffected by the other values in this<br>
	 * struct.<br>
	 * C type : char*
	 */
	@Field(8) 
	public AVSubtitleRect ass(Pointer<java.lang.Byte > ass) {
		this.io.setPointerField(this, 8, ass);
		return this;
	}
	/// C type : char*
	public final Pointer<java.lang.Byte > ass_$eq(Pointer<java.lang.Byte > ass) {
		ass(ass);
		return ass;
	}
}
