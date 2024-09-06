package redis.embedded.util;

import com.google.common.io.Resources;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;

public class JarUtil {

    public static File extractExecutableFromJar(String executable) throws IOException {
//        File tmpDir = Files.createTempDir();
        File tmpDir = Files.createTempDirectory("tempDir").toFile();
        tmpDir.deleteOnExit();

        File command = new File(tmpDir, executable);
        FileUtils.copyURLToFile(Resources.getResource(executable), command);
        command.deleteOnExit();
        command.setExecutable(true);

        return command;
    }
}
