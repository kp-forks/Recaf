package me.coley.recaf.workspace;

/**
 * The kind of a Java resource input.
 *
 * <ul>
 *     <li><b>Class</b> - Resource of a single file</li>
 *     <li><b>Jar</b> - Resource of multiple files in an archive</li>
 *     <li><b>Maven</b> - Resource of multiple files in a maven artifact</li>
 *     <li><b>URL</b> - Resource hosted online, should map to either a <b><i>CLASS</i></b> or <b><i>JAR</i></b></li>
 * </ul>
 *
 * @author Matt
 */
public enum ResourceKind {
	/**
	 * Resource of a single file.
	 */
	CLASS,
	/**
	 * Resource of multiple files in an archive.
	 */
	JAR,
	/**
	 * Resource of multiple files in a maven artifact.
	 */
	MAVEN,
	/**
	 * Resource hosted online, should map to either a <b><i>CLASS</i></b> or <b><i>JAR</i></b>.
	 */
	URL;
}
