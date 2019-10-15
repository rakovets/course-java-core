package com.rakovets.course.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Abstract Class for tests that reading Standard Output {@link System}
 *
 * @author Dmitry Rakovets
 */
public abstract class StandardOutputTest {
	private static final ByteArrayOutputStream OUTPUT_STREAM = new ByteArrayOutputStream();

	/**
	 * Clear output stream and connect it to Standard Output
	 */
	@BeforeEach
	void setUpStreams() {
		OUTPUT_STREAM.reset();
		System.setOut(new PrintStream(OUTPUT_STREAM));
	}

	/**
	 * Disconnect output stream from Standard Output
	 */
	@AfterEach
	void cleanUpStreams() {
		System.setOut(null);
	}

	/**
	 * @return content for Standard Output
	 */
	protected static String getStandardOutputContent() {
		return OUTPUT_STREAM.toString();
	}

	/**
	 * @return content for Standard Output and trim result
	 */
	protected static String getStandardOutputContentWithTrim() {
		return OUTPUT_STREAM.toString().trim();
	}
}