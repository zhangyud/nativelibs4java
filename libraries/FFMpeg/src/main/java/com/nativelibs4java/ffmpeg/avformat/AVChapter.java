package com.nativelibs4java.ffmpeg.avformat;
import com.nativelibs4java.ffmpeg.avformat.AvformatLibrary.AVMetadata;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : libavformat/avformat.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avformat") 
public class AVChapter extends StructObject {
	public AVChapter() {
		super();
	}
	public AVChapter(Pointer pointer) {
		super(pointer);
	}
	/// < unique ID to identify the chapter
	@Field(0) 
	public int id() {
		return this.io.getIntField(this, 0);
	}
	/// < unique ID to identify the chapter
	@Field(0) 
	public AVChapter id(int id) {
		this.io.setIntField(this, 0, id);
		return this;
	}
	public final int id_$eq(int id) {
		id(id);
		return id;
	}
	/// Conversion Error : AVRational (Unsupported type)
	/// < chapter start/end time in time_base units
	@Field(1) 
	public long start() {
		return this.io.getLongField(this, 1);
	}
	/// < chapter start/end time in time_base units
	@Field(1) 
	public AVChapter start(long start) {
		this.io.setLongField(this, 1, start);
		return this;
	}
	public final long start_$eq(long start) {
		start(start);
		return start;
	}
	/// < chapter start/end time in time_base units
	@Field(2) 
	public long end() {
		return this.io.getLongField(this, 2);
	}
	/// < chapter start/end time in time_base units
	@Field(2) 
	public AVChapter end(long end) {
		this.io.setLongField(this, 2, end);
		return this;
	}
	public final long end_$eq(long end) {
		end(end);
		return end;
	}
	/**
	 * < chapter title<br>
	 * C type : char*
	 */
	@Field(3) 
	public Pointer<java.lang.Byte > title() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * < chapter title<br>
	 * C type : char*
	 */
	@Field(3) 
	public AVChapter title(Pointer<java.lang.Byte > title) {
		this.io.setPointerField(this, 3, title);
		return this;
	}
	/// C type : char*
	public final Pointer<java.lang.Byte > title_$eq(Pointer<java.lang.Byte > title) {
		title(title);
		return title;
	}
	/// C type : AVMetadata*
	@Field(4) 
	public AVMetadata metadata() {
		return this.io.getTypedPointerField(this, 4);
	}
	/// C type : AVMetadata*
	@Field(4) 
	public AVChapter metadata(AVMetadata metadata) {
		this.io.setPointerField(this, 4, metadata);
		return this;
	}
	/// C type : AVMetadata*
	public final AVMetadata metadata_$eq(AVMetadata metadata) {
		metadata(metadata);
		return metadata;
	}
}
