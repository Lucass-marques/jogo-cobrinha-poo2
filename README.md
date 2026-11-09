# Jogo da Cobrinha 🐍 — POO II

Reprodução do **Jogo da Cobrinha** apresentado na aula de 26/10 de Programação Orientada a Objetos II (Trabalho 2).

O jogo usa **Thread** (laço principal do jogo), **interrupção de teclado** (`KeyAdapter`) e um **semáforo** (`Mutex`) protegendo a região crítica onde a direção da cobra é lida/alterada.

## Estrutura

```
JogoCobrinha/
├── src/
│   ├── Principal.java           # main: cria a janela e inicia a Thread do jogo
│   ├── Jogo.java                # JPanel + Runnable: laço do jogo, desenho e fim de jogo
│   ├── Cobrinha.java            # corpo da cobra, movimento, colisões e som de pontuação
│   ├── Comida.java              # posição aleatória e imagem da comida
│   └── InterrupcaoTeclado.java  # trata as setas do teclado (região crítica)
├── Comida.png                   # imagem da comida (maçã)
├── SomPontuacao.wav             # som ao comer
└── SomPerdeu.wav                # som de fim de jogo
```

## Pré-requisitos

- **Java JDK 8 ou superior** instalado (`javac` e `java` no PATH).

Para conferir, abra o terminal e rode:

```bash
java -version
```

```bash
javac -version
```

Se não tiver, baixe o JDK em https://adoptium.net/ e instale.

## Como rodar

1. Clone o repositório:

```bash
git clone https://github.com/Lucass-marques/jogo-cobrinha-poo2.git
```

2. Entre na pasta do projeto:

```bash
cd jogo-cobrinha-poo2
```

3. Compile:

```bash
javac -encoding UTF-8 -d bin src/*.java
```

4. Execute (**a partir da pasta raiz do projeto**, para que a imagem e os sons sejam encontrados):

```bash
java -cp bin Principal
```

> No Windows (PowerShell ou CMD) os mesmos comandos funcionam. Se o `src/*.java` der erro no CMD, use `javac -encoding UTF-8 -d bin src\Principal.java src\Jogo.java src\Cobrinha.java src\Comida.java src\InterrupcaoTeclado.java`.

### Rodando pelo Eclipse

1. `File > New > Java Project`, desmarque *Use default location* e aponte para a pasta clonada.
2. Abra `src/Principal.java` e clique em **Run**.
3. A pasta de trabalho padrão do Eclipse é a raiz do projeto, então `Comida.png` e os `.wav` são encontrados automaticamente.

## Como jogar

| Tecla | Ação |
|---|---|
| ← | Esquerda |
| → | Direita |
| ↑ | Cima |
| ↓ | Baixo |

- A cobra começa andando para a direita.
- Cada comida vale 1 ponto e aumenta o tamanho da cobra.
- O jogo termina se a cabeça bater no próprio corpo ou sair da tela — aparece **"Fim do Jogo."** e toca o som de derrota.

## Observação

No código original da aula os arquivos `Comida.png`, `SomPontuacao.wav` e `SomPerdeu.wav` eram carregados por caminho absoluto (`C:/Users/angel/OneDrive/Desktop/Jogos POO/JogoCobrinha/...`). Aqui eles são carregados pelo caminho relativo à pasta do projeto, para rodar em qualquer máquina. O restante do código está igual ao dos slides.
