# RandomUsernameGenerator

A simple command-line program that generates random usernames by combining words from a list and appending a random number suffix. Example output: `InternetFall146`.

This was created to help avoid username reuse across websites and improve privacy by making it easy to generate unique usernames.

## Features

- **Custom Count**: Generates the requested number of usernames using the `-c` command-line argument.
- **Improved Logic**: Combines two different words from an internal word list (prevents duplicates like `ForestForest`) and appends a random numeric suffix (range: 0 to 10000).
- **High Performance**: Uses internal caching and buffered output to generate millions of usernames in seconds.
- **Minimal Dependencies**: Requires only Java.

## Performance

The program is highly optimized for speed:
- Generates **1 million usernames in ~1.7 seconds**.
- Generates **10 million usernames in ~16 seconds**.

## Requirements

- Java 21 or newer (JDK or JRE installed)

## Quick Start

1. **Clone the repository**:
```bash
git clone https://github.com/klavoie1/RandomUsernameGenerator.git
cd RandomUsernameGenerator
 ```

2. Compile and run
 ```bash
 javac src/*.java
 java -cp src Main -c 5
 ```

## Usage

You can specify the number of usernames to generate using the `-c` flag:

```bash
java -cp src Main -c 4
```
**Example Output:**

```
0: ForestSky729
1: SunsetByte42
2: InternetFall146
3: SchoolPrime7653
```

If no arguments are provided, it defaults to generating 1 username.

You can also check the current version of the program with `-v` flag:
```bash
java -cp src Main -v
```

## Customization ideas

- Allow specifying the number length for the numeric suffix.
- Allow using an external custom word list file.
- Add a runnable JAR for easier distribution.

If you'd like, I can implement any of these options and add simple argument parsing.

## Contributing

Contributions are welcome. I am always looking for better ways of doing things or adding more benefits to this project.

## License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.
