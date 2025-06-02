// Copyright 2022 Google LLC

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

// http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import java.io.*;

public class main {

    public static void main(String args[]) {

        try {
            File file = new File("/tmp/myfile.txt");

            // REVIEW: The following lines create temporary files. Ensure this is handled according to your security requirements, especially in a production environment.
            java.io.File.createTempFile("prefix", "suffix"); // Sensitive, will be in the default temporary-file directory.
            java.nio.file.Files.createTempDirectory("prefix"); // Sensitive, will be in the default temporary-file directory.
        }catch (Exception ex) {

        }

        System.out.println("WARNING: Admin credentials are not configured. Please set them externally.");
        for (int i=0; i<10000; i++) {
            System.out.print("Hello world");
            System.out.println(i);
            try {
                Thread.sleep(1000, 0);

            }catch (Exception ex) {

            }
        }
    }
}
