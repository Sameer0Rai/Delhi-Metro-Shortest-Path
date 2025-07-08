# 🗺️ Delhi Metro Shortest Path Finder 🚇

This Java project computes the minimum number of station-hops between any two stations on a segment of the Delhi Metro network using Dijkstra's algorithm (unweighted edge count).

## ✨ Features

* 📋 **Flexible station list**: Define any subset of stations in `stations[]`.
* 🔗 **Custom adjacency matrix**: Provide your own `int[][] graph` for connections.
* 🔢 **Dynamic sizing**: Automatically derives `N` from `stations.length` and `graph.length` to avoid out-of-bounds errors.
* 🚀 **Dijkstra implementation**: Finds shortest paths (number of hops) from a chosen source station.

## ⚙️ Prerequisites

* ☕ Java Development Kit (JDK) 8 or later
* 💻 Command-line access (Windows PowerShell, macOS Terminal, or Linux shell)


## 🚀 Getting Started

1. **Clone or download** this repository to your local machine.
2. **Edit the source**

   * ✏️ Open `DelhiMetro.java`.
   * 🗒️ Update the `stations[]` array with your chosen station names.
   * 🔨 Modify the `graph[][]` matrix to reflect direct connections (`1`) between stations.
3. **Compile**

   ```bash
   cd DelhiMetro
   javac DelhiMetro.java
   ```
4. **Run**

   ```bash
   java DelhiMetro
   ```

   * 🎯 You’ll be prompted to enter a source station index (0 to N-1).
   * 📊 The program will then display the minimum hops from the chosen source to every other station.

## 📝 Example

Using the first 12 stations of the Red Line:

```java
String[] stations = {
  "Rithala", "Samaypur Badli", "Minor", "Shalimar Bagh", 
  "Azadpur", "Model Town", "Kingsway Camp", "GTB Nagar",
  "Gudapaar", "Vishwavidyalaya", "Vidhan Sabha", "Chandni Chowk"
};

int[][] graph = {
  {0,1,0,0,0,0,0,0,0,0,0,0},
  {1,0,1,0,0,0,0,0,0,0,0,0},
  {0,1,0,1,0,0,0,0,0,0,0,0},
  ...
};
```

## 📈 Extending to Full Delhi Metro

* 🔄 Replace the `stations[]` array with all 254 station names.
* 🛠️ Create your `graph[][]` matrix with direct connections between all consecutive stations from each metro line (Red, Blue, Yellow, etc.).
* 🧠 Automate using a line-by-line station list if needed.

## 🗺️ Graph Reference

The graph connections in this project are derived from the official Delhi Metro Map published by the Delhi Metro Rail Corporation (DMRC).

*Graph matrix generation powered by [ChatGPT by OpenAI](https://openai.com/chatgpt).*

## 🪪 License

This project is released under the [MIT License](https://opensource.org/licenses/MIT). Feel free to use, modify, and distribute it for personal or educational purposes.

---
