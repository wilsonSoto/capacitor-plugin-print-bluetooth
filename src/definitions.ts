export interface PrintBluetoothPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
