# RandomUsernameGenerator

A simple command-line program that generates one random username by combining words from a list and appending a random number suffix. Example output: `InternetFall146`.

This was created to help avoid username reuse across websites and improve privacy by making it easy to generate unique usernames.

## Features

- Generates the number of requested usernames entered.
- Combines words from an internal word list and appends a random numeric suffix (*#'s range from 0 to 9999*)
- Minimal dependencies — just Java

I have been able to generate 1 million usernames in 7.2 seconds. 

## Requirements

- Java 21 or newer (JDK or JRE installed)

## Quick start (basic)

Clone the repository:

```bash
git clone https://github.com/klavoie1/RandomUsernameGenerator.git
cd RandomUsernameGenerator
```

## Usage

The program will ask for the number of usenames to generate. Example output with 4 entered:

```
0: ForestSky729
1: SunsetByte42
2: InternetFall146
3: SchoolPrime7653
```

There are currently no command-line options implemented.

## Customization ideas

- Allow generating multiple usernames per run (e.g., `--count`) (_implemented with program_)
- Allow specifying number length for the numeric suffix
- Allow using a custom word list file (*Basically Already implemented*)
- Add a runnable JAR for easier distribution

If you'd like, I can implement any of these options and add simple argument parsing.

## Contributing

Contributions are welcome. I am always looking for better ways of doing things or adding more benefits to this project.

## License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.
