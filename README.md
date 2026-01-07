# RandomUsernameGenerator

A simple command-line program that generates one random username by combining words from a list and appending a random number suffix. Example output: `InternetFall146`.

This was created to help avoid username reuse across websites and improve privacy by making it easy to generate unique usernames.

## Features

- Generates a single username each time the program is run
- Combines words from an internal word list and appends a random numeric suffix
- Minimal dependencies — just Java

## Requirements

- Java 8 or newer (JDK or JRE installed)

## Quick start (basic)

Clone the repository:

```bash
git clone https://github.com/klavoie1/RandomUsernameGenerator.git
cd RandomUsernameGenerator
```

If the project is a single Java file (e.g. `Main.java`) in the repository root:

```bash
# compile
javac Main.java

# run
java Main
```

If the project uses multiple source files (package structure), compile all Java files to an output directory and run the main class:

```bash
# compile all .java files into `out`
mkdir -p out
find . -name "*.java" > sources.txt
javac -d out @sources.txt

# find the class that contains `public static void main(String[] args)` (example)
# then run with its fully qualified name:
java -cp out com.example.Main
```

If you don't know the main class, you can search the source for the main method:

```bash
grep -R "public static void main" -n .
```

## Usage

Run the compiled program — it prints a single username and exits. Example outputs:

```
ForestSky729
SunsetByte042
InternetFall146
```

There are currently no command-line options implemented; the program always prints one username per run.

## Customization ideas

- Allow generating multiple usernames per run (e.g., `--count`)
- Allow specifying number length for the numeric suffix
- Allow using a custom word list file
- Add a runnable JAR for easier distribution

If you'd like, I can implement any of these options and add simple argument parsing.

## Contributing

Contributions are welcome. If you want me to add the README or LICENSE file directly to the repo or open a PR, tell me which and I will do it. I can also detect your main class and update the run instructions to match your code layout.

## License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.
