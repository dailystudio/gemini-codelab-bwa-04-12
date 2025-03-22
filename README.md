# Code Lab of Gemini on Android

This project is a code lab to showcase the integration and usage of Gemini SDKs on Android, including real-time interactions and performance evaluation. It demonstrates capabilities such as leveraging **Google AI Client SDK** and **MediaPipe** for LLM processing, providing a comprehensive look at Gemini technology on Android.

## Installation and Usage

### Prerequisites

- Android Studio (latest version recommended).
- Minimum Android API Level 21.

### Installation Steps

#### General Steps

1. Clone the repository:
   ```bash
   git clone <repository_url>
   ```
2. Open the project in Android Studio.
3. Sync the Gradle files to install dependencies.
4. Build and run the application on an emulator or physical device.

#### Special Steps

##### For [Google AI Client SDK](https://ai.google.dev/gemini-api/docs)

- You need to apply an API key Google AI Studio and use it to authenticate and interact with Gemini API.
- Put your API key in `core/apikey.gemini`, with format `API_KEY=<your_api_key>`.

##### For [MediaPipe LLM](https://developers.googleblog.com/en/large-language-models-on-device-with-mediapipe-and-tensorflow-lite/)
- Download the required models manually from the [official MediaPipe repository](https://ai.google.dev/edge/mediapipe/solutions/genai/llm_inference/index#models).
- If you choose Gemma 3 1B model, place the downloaded model to `/data/local/tmp/llm/gemma3-1B-it-int4.task` on your device.
- If you choose Gemma 2 2B model, place the downloaded model to `/data/local/tmp/llm/model.bin` on your device.

### Usage Example

After installing the app, you can use it to chat with various Gemini models and attach local files for context. The app provides a flexible interface to experiment with different AI capabilities. Additionally, you can:

- Explore real-time AI-generated responses based on your prompts.
- Attach local files to enhance the AI's understanding of the context. It requires permissions for file access if using the file picker feature.
- Use the `Settings` menu to switch between different usage modes and configure parameters to suit your needs.

> **Developer Mode**
>
> Click the illustration at the top of the `About` dialog **5 times** to toggle between **User** mode and **Developer** mode. In **Developer** mode, you gain access to enhanced setting options and can track key performance metrics—such as response time, character count, and token count—directly within the app.

## Contribution

Contributions are welcome! Follow these steps:

1. Fork this repository.
2. Create a branch: `git checkout -b feature/<feature_name>`.
3. Commit your changes: `git commit -m '<commit_message>`.
4. Push to the branch: `git push origin feature/<feature_name>`.
5. Create a Pull Request.

## Contact

For questions or suggestions, feel free to reach out:

- [dailystudio2010@gmail.com](mailto\:dailystudio2010@gmail.com)

## License

This project is distributed under the [Apache 2.0 License](./LICENSE).

