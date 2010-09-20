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
public class AVProgram extends StructObject {
	public AVProgram() {
		super();
	}
	public AVProgram(Pointer pointer) {
		super(pointer);
	}
	@Field(0) 
	public int id() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public AVProgram id(int id) {
		this.io.setIntField(this, 0, id);
		return this;
	}
	public final int id_$eq(int id) {
		id(id);
		return id;
	}
	/**
	 * < network name for DVB streams<br>
	 * C type : char*
	 */
	@Field(1) 
	public Pointer<java.lang.Byte > provider_name() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * < network name for DVB streams<br>
	 * C type : char*
	 */
	@Field(1) 
	public AVProgram provider_name(Pointer<java.lang.Byte > provider_name) {
		this.io.setPointerField(this, 1, provider_name);
		return this;
	}
	/// C type : char*
	public final Pointer<java.lang.Byte > provider_name_$eq(Pointer<java.lang.Byte > provider_name) {
		provider_name(provider_name);
		return provider_name;
	}
	/**
	 * < service name for DVB streams<br>
	 * C type : char*
	 */
	@Field(2) 
	public Pointer<java.lang.Byte > name() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * < service name for DVB streams<br>
	 * C type : char*
	 */
	@Field(2) 
	public AVProgram name(Pointer<java.lang.Byte > name) {
		this.io.setPointerField(this, 2, name);
		return this;
	}
	/// C type : char*
	public final Pointer<java.lang.Byte > name_$eq(Pointer<java.lang.Byte > name) {
		name(name);
		return name;
	}
	@Field(3) 
	public int flags() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public AVProgram flags(int flags) {
		this.io.setIntField(this, 3, flags);
		return this;
	}
	public final int flags_$eq(int flags) {
		flags(flags);
		return flags;
	}
	/// Conversion Error : AVDiscard (Unsupported type)
	/// C type : unsigned int*
	@Field(4) 
	public Pointer<java.lang.Integer > stream_index() {
		return this.io.getPointerField(this, 4);
	}
	/// C type : unsigned int*
	@Field(4) 
	public AVProgram stream_index(Pointer<java.lang.Integer > stream_index) {
		this.io.setPointerField(this, 4, stream_index);
		return this;
	}
	/// C type : unsigned int*
	public final Pointer<java.lang.Integer > stream_index_$eq(Pointer<java.lang.Integer > stream_index) {
		stream_index(stream_index);
		return stream_index;
	}
	@Field(5) 
	public int nb_stream_indexes() {
		return this.io.getIntField(this, 5);
	}
	@Field(5) 
	public AVProgram nb_stream_indexes(int nb_stream_indexes) {
		this.io.setIntField(this, 5, nb_stream_indexes);
		return this;
	}
	public final int nb_stream_indexes_$eq(int nb_stream_indexes) {
		nb_stream_indexes(nb_stream_indexes);
		return nb_stream_indexes;
	}
	/// C type : AVMetadata*
	@Field(6) 
	public AVMetadata metadata() {
		return this.io.getTypedPointerField(this, 6);
	}
	/// C type : AVMetadata*
	@Field(6) 
	public AVProgram metadata(AVMetadata metadata) {
		this.io.setPointerField(this, 6, metadata);
		return this;
	}
	/// C type : AVMetadata*
	public final AVMetadata metadata_$eq(AVMetadata metadata) {
		metadata(metadata);
		return metadata;
	}
}
